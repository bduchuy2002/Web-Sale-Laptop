
const btn_add = document.getElementById('btn-success');
const btn_close = document.getElementById('btn-close');
const modal_content = document.getElementById('modal-content');
const modal_add = document.getElementById('addEmployeeModal');  
btn_add.addEventListener('click', ()=>{
	modal_add.classList.add('show');
});
btn_close.addEventListener('click', ()=>{
	modal_add.classList.remove('show');
});
modal_add.addEventListener('click', (e)=>{
	if(!modal_content.contains(e.target)){
		btn_close.click();
	}
});

