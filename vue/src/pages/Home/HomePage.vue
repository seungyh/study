<template>
    <p>{{num}}</p>
    <p>{{ content }}</p>
</template>
<script>
import { onMounted, inject, ref } from 'vue';

export default {
    setup() {
        const http = inject("axios");
        // data 정의
        const num = ref('');
        const content = ref("");
    
        const getList = () => {
            
            console.log("test console");
            
            http.post("/test")
                .then(res => {
                    console.log(res.data);
                    num.value = res.data.num;
                    content.value = res.data.content;
                })
                .catch(error =>{
                    console.log(error);
                })
            
        };
        onMounted(() => {
            getList();
        });
        return {
            num,
            content,
            getList,
        };
    },
}
</script>
<style>
</style>