const menu = {
    list() {
        return [
    {
        "backMenu":[
            {
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"客服聊天管理",
                        "menuJump":"列表",
                        "tableName":"chat"
                    }
                ],
                "menu":"客服聊天管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"单位信息类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryDanweixinxi"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"通知公告类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryGonggao"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"纳税服务投诉类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryNashuifuwutousu"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"新闻类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryNews"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"人事任免类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryRenshirenmian"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"税务欠款类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryShuiwuqiankuan"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"违法税收检举类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryWeifashuishou"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"意见征集类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryYijianzhengji"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"政策文件类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryZhegncewenjian"
                    }
                ],
                "menu":"基础数据管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"通知公告管理",
                        "menuJump":"列表",
                        "tableName":"gonggao"
                    }
					,
					{
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"人事任免管理",
                        "menuJump":"列表",
                        "tableName":"renshirenmian"
                    }
					,{
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"单位信息管理",
                        "menuJump":"列表",
                        "tableName":"danweixinxi"
                    }
                ],
                "menu":"信息公开管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"新闻信息管理",
                        "menuJump":"列表",
                        "tableName":"news"
                    }
                ],
                "menu":"新闻信息管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"政策文件管理",
                        "menuJump":"列表",
                        "tableName":"zhegncewenjian"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"政策文件收藏管理",
                        "menuJump":"列表",
                        "tableName":"zhegncewenjianCollection"
                    }
					,
					{
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"政策解读管理",
                        "menuJump":"列表",
                        "tableName":"zhengcejiedu"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"政策解读收藏管理",
                        "menuJump":"列表",
                        "tableName":"zhengcejieduCollection"
                    }
					,
					{
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"热点问答管理",
                        "menuJump":"列表",
                        "tableName":"liuyan"
                    }
                ],
                "menu":"政策文件管理"
            }
            ,{
                "child":[
					{
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"税务欠款管理",
                        "menuJump":"列表",
                        "tableName":"shuiwuqiankuan"
                    }
                ],
                "menu":"纳税服务管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"违法税收检举管理",
                        "menuJump":"列表",
                        "tableName":"weifashuishou"
                    }
					,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"纳税服务投诉管理",
                        "menuJump":"列表",
                        "tableName":"nashuifuwutousu"
                    }
					,
					{
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"意见征集管理",
                        "menuJump":"列表",
                        "tableName":"yijianzhengji"
                    }
                ],
                "menu":"互动交流管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"用户管理",
                        "menuJump":"列表",
                        "tableName":"yonghu"
                    }
                ],
                "menu":"用户管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"轮播图管理",
                        "menuJump":"列表",
                        "tableName":"config"
                    }
                ],
                "menu":"轮播图信息"
            }
        ],
        "frontMenu":[],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"管理员",
        "tableName":"users"
    }
]
    }
}
export default menu;
