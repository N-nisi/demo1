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
  const informationGender = document.getElementById("gender");
  informationGender.innerHTML = gender;

  const informationName = document.getElementById("name");
  informationName.innerHTML = nameTitle+" "+nameFirst+" "+nameLast;

  const informationCountry = document.getElementById("country");
  informationCountry.innerHTML = country;

  const informationEmail = document.getElementById("email");
  informationEmail.innerHTML = email;
});
