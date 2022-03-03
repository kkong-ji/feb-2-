// JSON 데이터를 다루기 위한 JS 기본 사용법


// [1]:데이터
const person = [
	{"name":"홍길동","age":20,"nationality":"대한민국"},
	{"name":"이순신","age":30,"nationality":"미국"},
	{"name":"강감찬","age":40,"nationality":"영국"},
	{"name":"을지문덕","age":50,"nationality":"프랑스"},
];

console.log(typeof person[0]);	// string
console.log(typeof person[1]);  // object

// [2]:출력
console.log('------------------------------------');
console.log(person[0].name + "" + person[3].age + "" + person[3].nationality);

// [3]:반복
console.log('------------------------------------전개 연산자');
// const str1 = "korea";
console.log([...person]);				// __proto__ --> Array
console.log([...person].length);		// 4
console.log([...person][0].name);		// 홍길동
console.log([...person][3].name);		// 을지문덕
console.log([...person][3].age);		// 50

console.log({...person});				// __proto__ --> Object
console.log({...person}[1].name);		// 이순신


// [4]: 반복 가능한 객체 --> for..of, ...(전개 연산자)
console.log('------------------------------------for..of');
for(let ele of person) {				// person --> iterable 즉, 반복 가능한 객체가 오면 된다.
	console.log(ele);
}

console.log('------------------------------------for..in');
for(let i in person[0]) {				// person --> iterable 즉, 반복 가능한 객체가 오면 된다.
	console.log(i);					    // name, age, nationality 와 같이 key값이 출력
}


// [5]: 수정
console.log('------------------------------------역따옴표');
person[0].name = "홍길자";
person[0].age = 22;
console.log(`홍길동의 이름이 ${person[0].name}로 수정되었고, 나이는 ${person[0].age} 살로 수정되었습니다.`);