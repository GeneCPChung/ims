addItem
document.addEventListener("DOMContentLoaded", function() {
	const addItemButton = document.querySelector('#addItem');
	addItemButton.addEventListener('click',addItem)
});

function addItem(event){
    // event.preventDefault();//prevents forms from refreshing
    
    const id = document.querySelector('#itemId').dataset.id
    const barcode = document.querySelector('#barcode').value
    const quantity = document.querySelector('#quantity').value
    const expirationDateString = document.querySelector('#expirationDateString').value
    const itemName = document.querySelector('#itemName').value
    const unit = document.querySelector('#unit').value
    const location = document.querySelector('#location').value
    const price = document.querySelector('#price').value
    const description = document.querySelector('#description').value
	const xhr = new XMLHttpRequest()
	xhr.onreadystatechange = function() {
		if (xhr.readyState === 4 && xhr.status === 200) {
			console.log(xhr);
		}
		
	}
    xhr.open('PUT', '/addTheItem/'+ encodeURI(id) + '/' + barcode + '/' + quantity + '/' + expirationDateString + '/' + itemName + '/' + unit + '/' + location + '/' + price + '/' + description, true)
    xhr.send()
}