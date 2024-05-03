function getdata(data){
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            console.log(data);
            resolve("sucess");

        },3000);
    })
}


async function getallldata(){
    console.log("getting data...0")
    await getdata(12345);
    console.log("getting data...1");
    await getdata(12345);
    console.log("getting data...2");
    await getdata(12345);
    console.log("getting data...3");
    await getdata(12345);
    console.log("getting data...4");
    await getdata(12345);
    console.log("getting data...5");
    await getdata(12345);
    console.log("getting data...6");
    await getdata(12345);
}


