// vue.config.js
module.exports = {
    /**
     *  "/vuewebapp/" in dev mode, "/"  in production mode
     *   WARNING:  Do NOT change the public path and proxy configuration
     *             unless you know what you are doing! Otherwise the
     *             Backend <-> Frontend connection might not work. 
    */
    publicPath: process.env.NODE_ENV === 'production' ? "/" : "/vuewebapp/",
    devServer: {
        proxy: {
            '/*': {
                target: "http://localhost:8080",
                logLevel: 'debug',
            }
        }
    }
}