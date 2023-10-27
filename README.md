[TCBackend.postman_collection.json](https://github.com/malmomani997/TCABackend/files/13189667/TCBackend.postman_collection.json)# TCABackend
Solution for the Backend Automation 
Here you will find Records of the automation script while it runs :-

1 - In this record you will see the add candidate the creation of the candidate happens from the API and I show the creation of that candidate also on frontend 

https://github.com/malmomani997/TCABackend/assets/145292080/65a98e56-5f7b-41db-8e02-dd1cc887b4c8

2 - In this record both of the add candidate and the search candidate tests will run and it will show all the data of the candidate using the id and at the end I show creation of that candidate also on frontend 

https://github.com/malmomani997/TCABackend/assets/145292080/8c932e6b-b600-485b-9eac-3920c138a70f

3 - In this video all of the add then search and finally the delete will run together a new user will be created and then searched for and after it gets all the data that user will be deleted 

https://github.com/malmomani997/TCABackend/assets/145292080/a56fdc2a-1e1e-417b-8383-d1c5499979e2

here is the API collection i found using charles for all (Add , Search , Delete) and used them on Postman to under stand how they works 

[Uploading TCBackend.postm{
	"info": {
		"_postman_id": "e79ec35c-633c-448e-8eb1-c50f5f18238c",
		"name": "TCBackend",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "Search",
			"request": {
				"method": "GET",
				"header": [
					{
						"key": "Host",
						"value": "opensource-demo.orangehrmlive.com"
					},
					{
						"key": "sec-ch-ua",
						"value": "\"Chromium\";v=\"118\", \"Google Chrome\";v=\"118\", \"Not=A?Brand\";v=\"99\""
					},
					{
						"key": "Accept",
						"value": "application/json"
					},
					{
						"key": "Cache-Control",
						"value": "no-store, no-cache, must-revalidate, post-check=0, pre-check=0"
					},
					{
						"key": "sec-ch-ua-mobile",
						"value": "?0"
					},
					{
						"key": "User-Agent",
						"value": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.0.0 Safari/537.36"
					},
					{
						"key": "sec-ch-ua-platform",
						"value": "\"Windows\""
					},
					{
						"key": "Sec-Fetch-Site",
						"value": "same-origin"
					},
					{
						"key": "Sec-Fetch-Mode",
						"value": "cors"
					},
					{
						"key": "Sec-Fetch-Dest",
						"value": "empty"
					},
					{
						"key": "Referer",
						"value": "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates"
					},
					{
						"key": "Accept-Language",
						"value": "en-US,en;q=0.9,fr-FR;q=0.8,fr;q=0.7,nl-NL;q=0.6,nl;q=0.5,fr-CA;q=0.4,nl-BE;q=0.3,fr-CH;q=0.2,sv-SE;q=0.1,sv;q=0.1,en-GB;q=0.1,en-CA;q=0.1,de-CH;q=0.1,de-DE;q=0.1,de;q=0.1"
					},
					{
						"key": "Cookie",
						"value": "orangehrm=92f9dca60d7478507ac75e545964b012"
					}
				],
				"url": {
					"raw": "https://opensource-demo.orangehrmlive.com/web/index.php/api/v2/recruitment/candidates?limit=50&offset=0&vacancyId=4&hiringManagerId=2&candidateId=24&status=2&model=list&sortField=candidate.dateOfApplication&sortOrder=DESC",
					"protocol": "https",
					"host": [
						"opensource-demo",
						"orangehrmlive",
						"com"
					],
					"path": [
						"web",
						"index.php",
						"api",
						"v2",
						"recruitment",
						"candidates"
					],
					"query": [
						{
							"key": "limit",
							"value": "50"
						},
						{
							"key": "offset",
							"value": "0"
						},
						{
							"key": "vacancyId",
							"value": "4"
						},
						{
							"key": "hiringManagerId",
							"value": "2"
						},
						{
							"key": "candidateId",
							"value": "24"
						},
						{
							"key": "status",
							"value": "2"
						},
						{
							"key": "model",
							"value": "list"
						},
						{
							"key": "sortField",
							"value": "candidate.dateOfApplication"
						},
						{
							"key": "sortOrder",
							"value": "DESC"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "Add",
			"request": {
				"method": "POST",
				"header": [
					{
						"key": "Host",
						"value": "opensource-demo.orangehrmlive.com"
					},
					{
						"key": "sec-ch-ua",
						"value": "\"Chromium\";v=\"118\", \"Google Chrome\";v=\"118\", \"Not=A?Brand\";v=\"99\""
					},
					{
						"key": "Accept",
						"value": "application/json"
					},
					{
						"key": "Content-Type",
						"value": "application/json"
					},
					{
						"key": "sec-ch-ua-mobile",
						"value": "?0"
					},
					{
						"key": "User-Agent",
						"value": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.0.0 Safari/537.36"
					},
					{
						"key": "sec-ch-ua-platform",
						"value": "\"Windows\""
					},
					{
						"key": "Origin",
						"value": "https://opensource-demo.orangehrmlive.com"
					},
					{
						"key": "Sec-Fetch-Site",
						"value": "same-origin"
					},
					{
						"key": "Sec-Fetch-Mode",
						"value": "cors"
					},
					{
						"key": "Sec-Fetch-Dest",
						"value": "empty"
					},
					{
						"key": "Referer",
						"value": "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/addCandidate"
					},
					{
						"key": "Accept-Language",
						"value": "en-US,en;q=0.9,fr-FR;q=0.8,fr;q=0.7,nl-NL;q=0.6,nl;q=0.5,fr-CA;q=0.4,nl-BE;q=0.3,fr-CH;q=0.2,sv-SE;q=0.1,sv;q=0.1,en-GB;q=0.1,en-CA;q=0.1,de-CH;q=0.1,de-DE;q=0.1,de;q=0.1"
					},
					{
						"key": "Cookie",
						"value": "orangehrm=92f9dca60d7478507ac75e545964b012"
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\"firstName\":\"Sami\",\"middleName\":\"Ahmad\",\"lastName\":\"Mohammad\",\"email\":\"SamiMohammad@gmail.com\",\"contactNumber\":\"07869454615\",\"keywords\":\"Hey\",\"comment\":\"there\",\"dateOfApplication\":\"2023-10-27\",\"consentToKeepData\":true,\"vacancyId\":31}"
				},
				"url": {
					"raw": "https://opensource-demo.orangehrmlive.com/web/index.php/api/v2/recruitment/candidates",
					"protocol": "https",
					"host": [
						"opensource-demo",
						"orangehrmlive",
						"com"
					],
					"path": [
						"web",
						"index.php",
						"api",
						"v2",
						"recruitment",
						"candidates"
					]
				}
			},
			"response": []
		},
		{
			"name": "Delete",
			"request": {
				"method": "DELETE",
				"header": [
					{
						"key": "Cookie",
						"value": "orangehrm=92f9dca60d7478507ac75e545964b012",
						"type": "text"
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"ids\" : [74]\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "https://opensource-demo.orangehrmlive.com/web/index.php/api/v2/recruitment/candidates",
					"protocol": "https",
					"host": [
						"opensource-demo",
						"orangehrmlive",
						"com"
					],
					"path": [
						"web",
						"index.php",
						"api",
						"v2",
						"recruitment",
						"candidates"
					]
				}
			},
			"response": []
		}
	]
}an_collection.json…]()

