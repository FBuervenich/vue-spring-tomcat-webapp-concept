// vue.config.js
module.exports = {
    devServer: {
        proxy: {
            '^/api': {
                target: "http://localhost:8080/vuewebapp",
                logLevel: 'debug',
                changeOrigin: true,
                cookieDomainRewrite: "localhost"
            }
        }
    }
}