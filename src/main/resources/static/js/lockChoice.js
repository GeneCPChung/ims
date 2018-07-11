
valueLock
document.addEventListener("DOMContentLoaded", function() {
	const addItemButton = document.querySelector('#addItem');
	addItemButton.addEventListener('click',valueLock)
});

function valueLock(){
    const locationValue = document.querySelector('#location').value
    const location = document.querySelector('#location')
    const locationCheckBox = document.querySelector('#location-Lock')
    if(locationCheckBox.checked == true){
        location.defaultValue = locationValue
        console.log(locationValue);
    }
};