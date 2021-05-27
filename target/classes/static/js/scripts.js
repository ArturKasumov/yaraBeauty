function showEquipment() {
    let part1 = document.getElementById("info_about_us_right_part1");
    let part2 = document.getElementById("info_about_us_right_part2");
    let part3 = document.getElementById("info_about_us_right_part3");

    part1.style.display = "inline";
    part2.style.display = "none";
    part3.style.display = "none";
}

function showService() {
    let part1 = document.getElementById("info_about_us_right_part1");
    let part2 = document.getElementById("info_about_us_right_part2");
    let part3 = document.getElementById("info_about_us_right_part3");

    part1.style.display = "none";
    part2.style.display = "inline";
    part3.style.display = "none";
}

function showAtmosphere() {
    let part1 = document.getElementById("info_about_us_right_part1");
    let part2 = document.getElementById("info_about_us_right_part2");
    let part3 = document.getElementById("info_about_us_right_part3");

    part1.style.display = "none";
    part2.style.display = "none";
    part3.style.display = "inline";
}
