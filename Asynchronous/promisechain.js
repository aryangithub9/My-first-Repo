function getdata(data,nextdata){
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            console.log(data);
            resolve("sucess")
            if(nextdata){
                nextdata();
            }
        },6000);
    })
}

console.log("getting data...1");
getdata(12345).then(()=>{
    console.log("getting data...1");
    getdata(12345).then(()=>{
        console.log("getting data...1");
        getdata(234567).then(()=>{
            console.log("getting data...1");
            getdata(12345);
        })
    })
})

