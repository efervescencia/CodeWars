function nextPrime(n){


if(n == 0 || n==1){
    return 2;
}
else if (n== 2){
  return 3;
  }  else if (n== 3 || n== 4){
  	return 5;
  	}
else {

	let encontrado = false;
  n++;

	while(encontrado == false){

		let primo = true;
    let limite = 0;
		if(n>5000000){
			limite = Math.sqrt(n);
		}
		else{
			limite = (n/2)+1
		}

		for (i=2;i<limite;i++){
			if(  (n % i) === 0 ){
    			primo = false;
		}
	}

	if(primo){return n;}
	else if ( (n % 2) === 0){
		n++;
	}
	else{
	n=n+2;
	}
}
}
}