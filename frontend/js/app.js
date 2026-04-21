function searchCompany() {
    let company = document.getElementById("companyInput").value;

    fetch(`http://localhost:8081/api/company?name=${company}`)
        .then(response => {
            if (!response.ok) {
                throw new Error("Network response was not ok");
            }
            return response.json();
        })
        .then(data => {
            document.getElementById("result").innerHTML = `
                <h2>${data.name}</h2>
                <p>${data.about}</p>
            `;
        })
        .catch(error => {
            console.error("Error:", error);
            document.getElementById("result").innerHTML = "Error fetching data";
        });
}