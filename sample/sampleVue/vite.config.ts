import { fileURLToPath, URL } from 'node:url'

import { defineConfig,loadEnv } from 'vite'
import vue from '@vitejs/plugin-vue'
import { VitePWA } from 'vite-plugin-pwa'
// @ts-ignore
const env = loadEnv((mode)=>{
  return mode
}, process.cwd(), "");
// https://vitejs.dev/config/
export default defineConfig({
  plugins: [vue()
  , VitePWA({ registerType: 'autoUpdate' ,  workbox: {
        clientsClaim: true,
        skipWaiting: true
      }})],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  },
  server: {
    proxy: {
      "/api": {
        target:
            env.APP_BACKEND == null ? "http://localhost:8090" : env.APP_BACKEND,
        changeOrigin: true,
        secure: false,
      },
    },
  },
})
