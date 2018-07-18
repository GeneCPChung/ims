searchItems
document.addEventListener("DOMContentLoaded", function() {
	const addItemButton = document.querySelector('#findItems');
	addItemButton.addEventListener('click',searchItems)
});

function searchItems(){
    const barcode = document.querySelector('#info_input').value
	const xhr = new XMLHttpRequest()
	xhr.onreadystatechange = function() {
		if (xhr.readyState === 4 && xhr.status === 200) {
            console.log(xhr);


		}
		
    }
    xhr.open('GET', '/searchBy/'+ barcode, true)
    xhr.send()
}