<?php
// take a line containing ID;Name;Latitude;Longitude;Height,
with ID and Height integers, Name a string and Latitude and Longitude floats
return an associative array with the ID as key and an array containing all the others informations
//
function create_station($description){
 	$splited_line=explode(';',$description);
	$station=[];
	$station[]=$splited_line[0];
	for ($i=1;i<5;i++)	
		$station[$splited_line[0]][]=$splited_line[i];
	return $station
}
?>
