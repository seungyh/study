// import Vue from 'vue';
import { createWebHistory, createRouter } from 'vue-router';
// import VueRouter from 'vue-router';

import home from '../pages/Home/HomePage.vue';

// Vue.use(VueRouter);


const routes = [
  {
    path: "/",
    name: "home",
    component: home
  }
]; 

const router = createRouter({
  history: createWebHistory(),
  routes
});

export default router;