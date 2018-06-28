
addItem
document.addEventListener("DOMContentLoaded", function() {
	const addItemButton = document.querySelector('#addItem');
	addItemButton.addEventListener('click',addItem)
});

function addItem(event){
	// event.preventDefault();//prevents forms from refreshing
    const barcode = document.querySelector('#barcode').value
    const quantity = document.querySelector('#quantity').value
    const expirationDateString = document.querySelector('#expirationDateString').value
    const itemName = document.querySelector('#itemName').value
    const unit = document.querySelector('#unit').value
    const location = document.querySelector('#location').value
    const price = document.querySelector('#price').value
    const description = document.querySelector('#description').value
	const xhr = new XMLHttpRequest()//ajax request 
	xhr.onreadystatechange = function() {
		if (xhr.readyState === 4 && xhr.status === 200) {
			console.log(xhr);
		}
		
	}
    xhr.open('POST', '/addTheItem/'+ barcode + '/' + quantity + '/' + expirationDateString + '/' + itemName + '/' + unit + '/' + location + '/' + price + '/' + description, true)
	//id and title are retrieved with the button press
    xhr.send()
}

deleteItem
document.addEventListener("DOMContentLoaded", function() {
    const deleteItemButton = document.querySelector('#deleteItem');
    deleteItemButton.addEventListener('click', deleteItem)
});

function deleteItem(event) {
    event.preventDefault();//prevents forms from refreshing
	const theButton = event.target
	const theDivWrappingTheButton = theButton.parentElement
	console.log(theButton)
	const id = theButton.dataset.id
	// do ajax request to /remove-tag?id={id}&bookReviewTitle={title}
	const xhr = new XMLHttpRequest()//ajax request 
	xhr.onreadystatechange = function() {
		if (xhr.readyState === 4 && xhr.status === 200) {
			console.log(xhr.response);
//			
//			// delete the tag from DOM
			theDivWrappingTheButton.parentElement.removeChild(theDivWrappingTheButton)
		}
	}
	xhr.open('DELETE', '/deleteTheItem' + encodeURI(id),true)
	//id and title are retrieved with the button press
	xhr.send()
}

