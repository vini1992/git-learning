<?php

$first=$_GET['first'];
$last=$_GET['last'];
$user=$_GET['uname'];
$mm=$_GET['MM'];
$d=$_GET['day'];
$y=$_GET['year'];
echo 'wellcome ' . $first;
echo ' ' . $last . '.<br>';
echo 'user name : ' .$user . '.<br>';
echo 'Birth date : ' . $mm . ' ';
echo $d .' ';
echo $y . '<br>';

?>