//"(123) 456-7890"  => true
//"(1111)555 2345"  => false
//"(098) 123 4567"  => false

/**
 * 
 * @param {*} phoneNumber 
 */

function validPhoneNumber(phoneNumber){    
    return phoneNumber.length==14 && phoneNumber.match("(\\([0-9]{3}\\) [0-9]{3}-[0-9]{4})")!=null;
}


console.log(validPhoneNumber("aa(123) 456-7890"));
console.log(validPhoneNumber("(1111)555 2345"));
console.log(validPhoneNumber("098 123-4567"));
