<?php
	function propriete($ligne){
		$tab= explode(':',$ligne);
		$key=trim($tab[0]);
		$value=trim($tab[1]);
		$key=str_replace(')','',$key);
		$key=str_replace('(','',$key);
		return array($key=>$value);
	}
	function proprieteToHTML($array){
		$text='';
		$key=key($array);
			if ($key=="année"){
				$text.= "<time class='".$key."' >".$array[$key]."</time>";		
			}
			elseif ($key=="titre"){
				$text.="<h2 class='".$key."' >".$array[$key]."</h2>";
			}
			else{
				$text.="<div class'".$key."' >".$array[$key]."</div>";
				}
		return $text;
	}
	function couvertureToHTML($array){
		return "<div class='couverture'><img src='couvertures/".$array[couverture]."' alt='couverture'/></div>";
	}
?>
