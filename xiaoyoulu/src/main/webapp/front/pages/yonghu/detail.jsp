<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!-- 首页 -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>首页</title>
    <link rel="stylesheet" href="../../layui/css/layui.css">
    <link rel="stylesheet" href="../../xznstatic/css/bootstrap.min.css" />
    <!-- 样式 -->
    <link rel="stylesheet" href="../../css/style.css"/>
    <!-- 主题（主要颜色设置） -->
    <link rel="stylesheet" href="../../css/theme.css"/>
    <!-- 通用的css -->
    <link rel="stylesheet" href="../../css/common.css"/>
</head>
<style>
    /*.data-detail .title {
        font-size:35px;
        line-height:100%;
        font-weight:700;
        color:#4b4b46;
        margin-top:-4px;
        margin-bottom:24px;
        border:none;
    }
    .data-detail .detail-item {
        font-size:16px;
        line-height:50px;
        color:#4b4b46;
        background:#f3f3f9;
        border:1px solid rgba(75,75,70,.07);
        border-radius:7px;
        padding:0 35px;
        margin-bottom:15px;
        width: auto;
    }
    div .detail-item span:nth-child(1) {
        font-size:18px;
        font-weight:700;
        width:40%
    }*/</style>
<body>

    <div id="app">
        <div class="data-detail">
            <div class="data-detail-breadcrumb">
                <span class="layui-breadcrumb">
                    <a href="../home/home.jsp">首页</a>
                    <a><cite>{{detail.yonghuName}}</cite></a>
                </span>


            </div>
            <div class="layui-row">
                <div class="layui-col-md5">
                    <div class="layui-carousel" id="swiper">
                        <div carousel-item id="swiper-item">
                            <div v-for="(item,index) in swiperList" v-bind:key="index">
                                <img class="swiper-item" :src="item.img">
                            </div>
                        </div>
                    </div>

                </div>
                <div class="layui-col-md7" style="padding-left: 20px;">
                        <h1 class="title">{{detail.yonghuName}}</h1>

                        <div v-if="detail.yonghuPhone" class="detail-item">
                            <span>用户手机号：</span>
                            <span class="desc">
                                        {{detail.yonghuPhone}}
                            </span>
                        </div>

                        <div v-if="detail.yonghuEmail" class="detail-item">
                            <span>电子邮箱：</span>
                            <span class="desc">
                                        {{detail.yonghuEmail}}
                            </span>
                        </div>

                        <div v-if="detail.yonghuAddress" class="detail-item">
                            <span>地址：</span>
                            <span class="desc">
                                        {{detail.yonghuAddress}}
                            </span>
                        </div>

                        <div v-if="detail.yonghuQq" class="detail-item">
                            <span>QQ：</span>
                            <span class="desc">
                                        {{detail.yonghuQq}}
                            </span>
                        </div>

                        <div v-if="detail.yonghuWeixin" class="detail-item">
                            <span>微信：</span>
                            <span class="desc">
                                        {{detail.yonghuWeixin}}
                            </span>
                        </div>

                        <div v-if="detail.sexTypes" class="detail-item">
                            <span>性别：</span>
                            <span class="desc">
                                {{detail.sexValue}}
                            </span>
                        </div>

                        <div v-if="detail.nianling" class="detail-item">
                            <span>年龄：</span>
                            <span class="desc">
                                {{detail.nianling}}
                            </span>
                        </div>

                        <%--<div v-if="detail.yonghuText" class="detail-item">
                            <span>其他信息：</span>
                            <span class="desc">
                                        {{detail.yonghuText}}
                            </span>
                        </div>--%>

                    <div class="detail-item">

                        <!--<button onclick="addYonghuqqqqqqqq()" type="button" class="layui-btn layui-btn-warm">
                                添加到购物车
                            </button>-->
                    </div>

                    <div class="detail-item" style="text-align: right;">
                    </div>
                </div>
            </div>

            <div class="layui-row">
                <div class="layui-tab layui-tab-card">

                    <ul class="layui-tab-title">
                        <li class="layui-this">其他信息</li>
                    </ul>

                    <div class="layui-tab-content">
                        <div class="layui-tab-item layui-show">
                            <div v-html="myFilters(detail.yonghuText)"></div>
                        </div>


                    </div>
                </div>
            </div>
        </div>    </div>

<script type="text/javascript" src="../../xznstatic/js/jquery.min.js"></script>
<script src="../../xznstatic/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<script src="../../layui/layui.js"></script>
<script src="../../js/vue.js"></script>
<!-- 组件配置信息 -->
<script src="../../js/config.js"></script>
<!-- 扩展插件配置信息 -->
<script src="../../modules/config.js"></script>
<!-- 工具方法 -->
<script src="../../js/utils.js"></script>

<script>
    Vue.prototype.myFilters= function (msg) {
        if(msg != null){
            return msg.replace(/\n/g, "<br>");
        }else{
            return "";
        }
    };
    var vue = new Vue({
        el: '#app',
        data: {
            // 轮播图
            swiperList: [],
            // 数据详情
            detail: {
                id: 0
            },
            // 商品标题
            title: '',

            storeupFlag: 0,//收藏 [0为收藏 1已收藏]
            //系统推荐
            yonghuRecommendList: [],
            dataList: [],
            // 当前详情页表
            detailTable: 'yonghu',
        },
        //  清除定时器
        destroyed: function () {
            // 不知道具体作用
            // window.clearInterval(this.inter);
        },
        methods: {
            jump(url) {
                jump(url)
            }
        }
    });

    layui.use(['layer', 'form', 'element', 'carousel', 'http', 'jquery', 'laypage'], function () {
        var layer = layui.layer;
        var element = layui.element;
        var form = layui.form;
        var carousel = layui.carousel;
        var http = layui.http;
        var jquery = layui.jquery;
        var laypage = layui.laypage;

        var limit = 10;

        // 设置数量
        jquery('#buyNumber').val(vue.buyNumber);

        // 数据ID
        var id = http.getParam('id');
        vue.detail.id = id;
        // 当前详情
        http.request(`${vue.detailTable}/detail/` + id, 'get', {}, function (res) {
            // 详情信息
            vue.detail = res.data;
            vue.title = vue.detail.yonghuName;
           // 轮播图片
            vue.swiperList = vue.detail.yonghuPhoto ? vue.detail.yonghuPhoto.split(",") : [];
            var swiperItemHtml = '';
            for (let item of vue.swiperList) {
                swiperItemHtml +=
                        '<div>' +
                        '<img class="swiper-item" src="' + item + '" style="margin-top: 50px;" >' +
                        '</div>';
            }
            jquery('#swiper-item').html(swiperItemHtml);
            // 轮播图
            carousel.render({
                elem: '#swiper',
                width: swiper.width, height: swiper.height,
                arrow: swiper.arrow,
                anim: swiper.anim,
                interval: swiper.interval,
                indicator: swiper.indicator
            });
        });

        // 系统推荐
        http.request(`yonghu/list`, 'get', {
            page: 1,
            limit: 5,
            yonghuTypes: vue.detail.yonghuTypes,

                sexTypes: vue.detail.sexTypes,

        }, function (res) {
            vue.yonghuRecommendList = res.data.list;
        });



    });





</script>
</body>
</html>
