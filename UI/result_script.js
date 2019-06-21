var code = "";

function onGoClick() {
    code = $("#country").val();
    update(code);
}

function update(code) {
    if (code !== "") {
        var opts = {
            method: 'GET',
            headers: {}
        };

        fetch('http://localhost:8080/api/track/top?country=' + code, opts)
            .then(function (response) {
                return response.json();
            })
            .then(function (data) {
                if (data === undefined) {
                    alert("No data to display!");
                } else {
                    $("#track_div").html("");
                    var artistName = "<div> Artist: " + data["artistName"] + "</div>";
                    var trackName = "<div> Track: " + data["trackName"] + "</div>";
                    var link = "<div> Link: <a target=\"_blank\" href=\"" + data["link"] + "\">" + artistName + "</a>" + "</div>";
                    $("#track_div").append(artistName + trackName + link);
                }
            })
            .catch(function (reason) {
                $("#track_div").html("");
                alert("Country not found.");
            });
    } else {
        alert("Country must be provided.");
    }
}