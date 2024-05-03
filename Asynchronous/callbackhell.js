function getdata(data,nexdata){
    setTimeout(()=>{
        console.log(data);
        if(nexdata){
            nexdata();
        }
    },4000);
}

console.log("getting data....1");
getdata(1234,()=>{
    console.log("getting data....2")
    getdata(123,()=>{
        console.log("getting data....3")
        getdata(1234,()=>{
            console.log("getting data....4")
            getdata(123456,()=>{
                console.log("getting data....5")
                getdata(384765);
            })
        });
    });
});