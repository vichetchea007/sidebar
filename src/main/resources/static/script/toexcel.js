var header = "<!DOCTYPE html><html lang='en' dir='ltr' xmlns:th='http://www.thymeleaf.org'>";
header += "<header><meta charset='ISO-8859-1'><title>Export to Excel</title>" 
header += "<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65' crossorigin='anonymous'>"; 
header += "</header>";

function toExcel(html, excelName) {
    
    var data = header + "<body>" 
    data += html;
    data += "</body></html>"
    var a = document.createElement('a');
    a.href = 'data:application/vnd.ms-excel,' + encodeURIComponent(data);
    a.download = 'data.xls';
    a.click();
    
}