
document.addEventListener("DOMContentLoaded", function() {
    const deleteItemButtonsCollection = document.querySelectorAll('.deleteItem');
    deleteItemButtonList = Array.from(deleteItemButtonsCollection)
	deleteItemButtonList.forEach( function(deleteItemButton){
		deleteItemButton.addEventListener('click', deleteItem)
});

function deleteItem(event) {
	const theButton = event.target
	const theDivWrappingTheButton = theButton.parentElement
	console.log(theButton)
	const id = theButton.dataset.id
	// do ajax request to /remove-tag?id={id}&bookReviewTitle={title}
	const xhr = new XMLHttpRequest()//ajax request 
	xhr.onreadystatechange = function() {
		if (xhr.readyState === 4 && xhr.status === 200) {
            console.log(xhr.response);
            console.log(id);			
			// delete the tag from DOM
			theDivWrappingTheButton.parentElement.removeChild(theDivWrappingTheButton)
		}
	}
	xhr.open('DELETE', '/deleteTheItem/' + encodeURI(id),true)
	//id and title are retrieved with the button press
	xhr.send()
}});
