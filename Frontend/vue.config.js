// vue.config.js
module.exports = {
    devServer: {
        proxy: {
            //     '^/': {
            //         pathRewrite: {'/' : '/vuewebapp'},
            //         target: "http://localhost:8080",
            //         secure: false,
            //         changeOrigin: true,
            //         logLevel: "debug",
            //         cookieDomainRewrite: "localhost",
            //         onProxyReq: (proxyReq, req, res, options) => {
            //             // console.log(proxyReq);
            //             // console.log(req);
            //             // console.log(res);
            //             // console.log(options);
            //             // // proxyReq.setHeader('Cookie', cookie);
            //             // proxyReq.
            //         },
            // onProxyRes: (proxyRes) => {
            //     // Object.keys(proxyRes.headers).forEach((key) => {
            //     //     if (key === 'set-cookie' && proxyRes.headers[key]) {
            //     //         console.log(key + " => " + proxyRes.headers[key])
            //     //         const cookieTokens = proxyRes.headers[key].split(';');
            //     //         cookie = cookieTokens.filter(element => element.includes('JSESSIONID')).join(';');
            //     //     }
            //     // });
            // },
            //     },

            '/*': {
                target: "http://localhost:8080",
                // pathRewrite: { '^/': '/vuewebapp/' },
                logLevel: 'debug',
                // changeOrigin: false,
                // followRedirects: true,
            }
        }
    }
}