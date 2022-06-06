serviceEndpointURL = window.location.protocol + "//" + window.location.host;

var prod1 = {

    "name": "Flower",
    "price": "12",
    "lotsize": "1.2"
}

var priceList = ["10", "20", "30"]

priceList[0]

// JSON notation
var ProductArray = [
    {
        "name": "Flower",
        "price": "12",
        "lotsize": "1.2"
    },
    {
        "name": "Flower2",
        "price": "15",
        "lotsize": "1.9"
    },
    {
        "name": "Flower3",
        "price": "17",
        "lotsize": "1"
    },
    {
        "name": "Flower4",
        "price": "19",
        "lotsize": "1.1"
    }
]

ProductArray[1].lotsize


function getProduct(pid, callback) {
    $.ajax({
        type: "GET",
        dataType: "json",
        url: serviceEndpointURL + "/api/customer/" + customerID,
        success: function (data) {
            callback(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(jqXHR, textStatus, errorThrown);
        }
    });
}

