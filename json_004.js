// 중첩된 JSON 데이터 다루기
// 한 권의 도서 정보를 갖고있는 JSON 데이터에서 해당 도서가 속해있는 카테고리를 출력하시오.

// [1]:중첩 데이터
window.onload = () => {
	const book = {
		"isbn":"123-456-789",
		"author":{
			"name":"홍길동",
			"email":"hong@hongkildong.com"		
		},
		"editor":{
			"name":"이순신",
			"email":"lee@leesoonsin.com"
		},
		"title":"대한민국의 정의는 죽었는가?",
			"category":[
			"Non-Fiction", "IT", "Politics"
		]
	}

	console.log(book["author"].name);	// 홍길동
	console.log(book["editor"].name);   // 이순신
	console.log(book["isbn"]);
	console.log(book.isbn);
	console.log(book.title);
	console.log(book.category);

	// 개별 액세스
	let val = "";
	// val = book.category[0];
	// document.getElementById("aaa").innerText = val;
	
	// 반복문을 이용한 액세스
	// for
	// for (let i=0; i<book.category.length; i++) {
		// val += book.category[i] + "<br>";
		// val += `${book["category"][i]} <br>`;
	// }
	// document.getElementById("aaa").innerHTML = val;
	
	// for ..in
	// for(let i in book.category ) {
		// val += book.category[i] + "<br>";
	// }
	// document.getElementById("aaa").innerHTML = val;
	
	// for ..of
	for(let value of book.category) {
		val += value + "<br>";
	}
	document.getElementById("aaa").innerHTML = val;
	
};