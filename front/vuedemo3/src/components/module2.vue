<template>
  <div>
    <span v-text='msg'></span> <br>
    <span v-text='redMsg'></span> <br>
    <span v-text='getMsg()'></span> <br>
    <span v-text='age>18?"成年":"未成年"'></span> <br>
    <span v-text='bee.split(" ").reverse().join("-")'></span> <br>
    <span v-html='msg'></span> <br>
    <span v-html='redMsg'></span> <br>
    <span v-html='greenMsg'></span> <br>
    <span v-text='greenMsg'></span> <br>
    <span v-html="`<font color='green'>${msg}</font>`"></span> <br>
    <span>{{msg}}</span> <br>
  </div>
  <div>
    <a
        :href='data.url'
        target="_top">
      <img
          :src="data.logo"
          :title="data.name">
      <br>
      <input type="button"
             :value="`点击访问${data.name}`">
    </a>
  </div>
  <div>
  <h1>count的值是:{{ count }}</h1>
  <!-- 方法事件处理器 -->
  <button v-on:click="addCount()">addCount</button> <br>
  <!-- 内联事件处理器 -->
  <button @click="count++">incrCount</button> <br>
  <!-- 事件修饰符 once 只绑定事件一次 -->
  <button @click.once="count++">addOnce</button> <br>
  <!-- 事件修饰符 prevent 阻止组件的默认行为 -->
  <a href="http://www.atguigu.com" target="_blank" @click.prevent="count++">prevent</a> <br>
  <!-- 原生js方式阻止组件默认行为 (推荐) -->
  <a href="http://www.atguigu.com" target="_blank" @click="incrCount($event)">prevent</a> <br>
</div>
</template>

<script type="module" setup>
import {ref} from "vue";
let msg ='hello vue3'
let getMsg= ()=>{
  return msg
}
let age = 19
let bee = '蜜 蜂'
let redMsg ='<font color=\'red\'>msg</font>'
let greenMsg =`<font color=\'green\'>${msg}</font>`
const data = {
  name: '尚硅谷',
  url: "http://www.atguigu.com",
  logo: "http://www.atguigu.com/images/index_new/logo.png"
};

// 响应式数据 当发生变化时,会自动更新 dom树
let count=ref(0)
let addCount= ()=>{
  count.value++
}
let incrCount= (event)=>{
  count.value++
  // 通过事件对象阻止组件的默认行为
  event.preventDefault();

}

</script>




<style scoped>

</style>