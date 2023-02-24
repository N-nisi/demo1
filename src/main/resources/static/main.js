const RANDOM_URL = 'https://randomuser.me/api/';

fetch(RANDOM_URL).then(function(response) {
  return response.text();
}).then(function(data) {

// JSONをJSオブジェクトに変換
  let randomData = JSON.parse(data);

// 必要なプロパティを取得
  const gender = randomData.results[0].gender;
  const nameTitle = randomData.results[0].name.title;
  const nameFirst = randomData.results[0].name.first;
  const nameLast = randomData.results[0].name.last;
  const country = randomData.results[0].location.country;
  const email = randomData.results[0].email;

// HTML書き換え
  const information = document.getElementById("gender");
  information.innerHTML = gender;

  const information1 = document.getElementById("name");
  information1.innerHTML = nameTitle+" "+nameFirst+" "+nameLast;

  const information2 = document.getElementById("country");
  information2.innerHTML = country;

  const information3 = document.getElementById("email");
  information3.innerHTML = email;
});
