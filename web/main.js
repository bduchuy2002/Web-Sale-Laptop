// Siler show ------------------------

const rightBtn = document.querySelector('.fa-chevron-right')
const leftBtn = document.querySelector('.fa-chevron-left')
const imgNum = document.querySelectorAll('.slider-content-left-top img')
var index = 1
console.log(imgNum.length)
rightBtn.addEventListener("click", function(){
    index = index +1
    if(index > imgNum.length -1){
        index = 0
    }
    document.querySelector(".slider-content-left-top").style.right =  index*100+"%"
})
leftBtn.addEventListener("click", function(){
    index = index - 1
    if(index <= 0){
        index = imgNum.length -1
    }
    document.querySelector(".slider-content-left-top").style.right =  index*100+"%"
})

// Slider show btn bottom
const btnNum = document.querySelectorAll('.slider-content-left-bottom li')
btnNum.forEach(function(button, index){
    button.addEventListener("click",function(){
        removeActive()
        document.querySelector(".slider-content-left-top").style.right =  index*100+"%"
        button.classList.add("active")
    })
})

function removeActive(){
    var btnAc = document.querySelector('.active')
    btnAc.classList.remove('active')
}

function autoShow(){
    index += 1
    if(index > imgNum.length -1) index = 0
    removeActive()
    document.querySelector(".slider-content-left-top").style.right =  index*100+"%"
    btnNum[index].classList.add("active")
}
setInterval(autoShow, 3000)