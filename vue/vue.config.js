const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  devServer: {
    proxy: {
      '/': {
        // target 8080 포트로 변환되어 요청
        target: 'http://localhost:8080',
        // chageOrigin을 true로 해줘야 cors 문제를 해결
        changeOrigin: true,
        ws: false,
      },
    },
  },
})