import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import chat from '@/views/modules/chat/list'
    import danweixinxi from '@/views/modules/danweixinxi/list'
    import dictionary from '@/views/modules/dictionary/list'
    import gonggao from '@/views/modules/gonggao/list'
    import liuyan from '@/views/modules/liuyan/list'
    import nashuifuwutousu from '@/views/modules/nashuifuwutousu/list'
    import news from '@/views/modules/news/list'
    import renshirenmian from '@/views/modules/renshirenmian/list'
    import shuiwuqiankuan from '@/views/modules/shuiwuqiankuan/list'
    import weifashuishou from '@/views/modules/weifashuishou/list'
    import yijianzhengji from '@/views/modules/yijianzhengji/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zhegncewenjian from '@/views/modules/zhegncewenjian/list'
    import zhegncewenjianCollection from '@/views/modules/zhegncewenjianCollection/list'
    import zhengcejiedu from '@/views/modules/zhengcejiedu/list'
    import zhengcejieduCollection from '@/views/modules/zhengcejieduCollection/list'
    import config from '@/views/modules/config/list'
    import dictionaryChat from '@/views/modules/dictionaryChat/list'
    import dictionaryDanweixinxi from '@/views/modules/dictionaryDanweixinxi/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionaryJiaofei from '@/views/modules/dictionaryJiaofei/list'
    import dictionaryNashuifuwutousu from '@/views/modules/dictionaryNashuifuwutousu/list'
    import dictionaryNashuifuwutousuChuli from '@/views/modules/dictionaryNashuifuwutousuChuli/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionaryRenshirenmian from '@/views/modules/dictionaryRenshirenmian/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
    import dictionaryShuiwuqiankuan from '@/views/modules/dictionaryShuiwuqiankuan/list'
    import dictionaryWeifashuishou from '@/views/modules/dictionaryWeifashuishou/list'
    import dictionaryWeifashuishouChuli from '@/views/modules/dictionaryWeifashuishouChuli/list'
    import dictionaryYijianzhengji from '@/views/modules/dictionaryYijianzhengji/list'
    import dictionaryYijianzhengjiChuli from '@/views/modules/dictionaryYijianzhengjiChuli/list'
    import dictionaryZhegncewenjian from '@/views/modules/dictionaryZhegncewenjian/list'
    import dictionaryZhegncewenjianCollection from '@/views/modules/dictionaryZhegncewenjianCollection/list'
    import dictionaryZhengcejieduCollection from '@/views/modules/dictionaryZhengcejieduCollection/list'
    import dictionaryZhuangtai from '@/views/modules/dictionaryZhuangtai/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryChat',
        name: '数据类型',
        component: dictionaryChat
    }
    ,{
        path: '/dictionaryDanweixinxi',
        name: '单位信息类型',
        component: dictionaryDanweixinxi
    }
    ,{
        path: '/dictionaryGonggao',
        name: '通知公告类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionaryJiaofei',
        name: '是否缴费',
        component: dictionaryJiaofei
    }
    ,{
        path: '/dictionaryNashuifuwutousu',
        name: '纳税服务投诉类型',
        component: dictionaryNashuifuwutousu
    }
    ,{
        path: '/dictionaryNashuifuwutousuChuli',
        name: '状态',
        component: dictionaryNashuifuwutousuChuli
    }
    ,{
        path: '/dictionaryNews',
        name: '新闻类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionaryRenshirenmian',
        name: '人事任免类型',
        component: dictionaryRenshirenmian
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionaryShuiwuqiankuan',
        name: '税务欠款类型',
        component: dictionaryShuiwuqiankuan
    }
    ,{
        path: '/dictionaryWeifashuishou',
        name: '违法税收检举类型',
        component: dictionaryWeifashuishou
    }
    ,{
        path: '/dictionaryWeifashuishouChuli',
        name: '状态',
        component: dictionaryWeifashuishouChuli
    }
    ,{
        path: '/dictionaryYijianzhengji',
        name: '意见征集类型',
        component: dictionaryYijianzhengji
    }
    ,{
        path: '/dictionaryYijianzhengjiChuli',
        name: '状态',
        component: dictionaryYijianzhengjiChuli
    }
    ,{
        path: '/dictionaryZhegncewenjian',
        name: '政策文件类型',
        component: dictionaryZhegncewenjian
    }
    ,{
        path: '/dictionaryZhegncewenjianCollection',
        name: '收藏表类型',
        component: dictionaryZhegncewenjianCollection
    }
    ,{
        path: '/dictionaryZhengcejieduCollection',
        name: '收藏表类型',
        component: dictionaryZhengcejieduCollection
    }
    ,{
        path: '/dictionaryZhuangtai',
        name: '状态',
        component: dictionaryZhuangtai
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/chat',
        name: '客服聊天',
        component: chat
      }
    ,{
        path: '/danweixinxi',
        name: '单位信息',
        component: danweixinxi
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/gonggao',
        name: '通知公告',
        component: gonggao
      }
    ,{
        path: '/liuyan',
        name: '热点问答',
        component: liuyan
      }
    ,{
        path: '/nashuifuwutousu',
        name: '纳税服务投诉',
        component: nashuifuwutousu
      }
    ,{
        path: '/news',
        name: '新闻信息',
        component: news
      }
    ,{
        path: '/renshirenmian',
        name: '人事任免',
        component: renshirenmian
      }
    ,{
        path: '/shuiwuqiankuan',
        name: '税务欠款',
        component: shuiwuqiankuan
      }
    ,{
        path: '/weifashuishou',
        name: '违法税收检举',
        component: weifashuishou
      }
    ,{
        path: '/yijianzhengji',
        name: '意见征集',
        component: yijianzhengji
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/zhegncewenjian',
        name: '政策文件',
        component: zhegncewenjian
      }
    ,{
        path: '/zhegncewenjianCollection',
        name: '政策文件收藏',
        component: zhegncewenjianCollection
      }
    ,{
        path: '/zhengcejiedu',
        name: '政策解读',
        component: zhengcejiedu
      }
    ,{
        path: '/zhengcejieduCollection',
        name: '政策解读收藏',
        component: zhengcejieduCollection
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
