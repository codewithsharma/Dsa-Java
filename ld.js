// function isPrime(n){
//     let i=2
//     if(n>2){
//         if(n%i==0){
//             console.log("not prime")
//         }
//         else i++
//         console.log("prime")
//     }
   
    
// }
// isPrime(5)



// Doors Open or closed


let door =100
let opendoors =0
let closedDoors =0
for(let i=1;i<=100;i++){

    for(j=1;j<=100;j++){

        if(i%j==0){
            opendoors++
        }
        closedDoors++

    }
    
}
console.log(opendoors , "are opened")
console.log(closedDoors, "are closed")