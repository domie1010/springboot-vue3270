const base = {
    get() {
        return {
            url : "http://localhost:8080/shuiwumenhuwangzhan/",
            name: "shuiwumenhuwangzhan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shuiwumenhuwangzhan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "税务门户网站"
        } 
    }
}
export default base
