<?php
	function cercle($cx,$cy,$r){
		return '<circle cx="'.$cx.'" cy="'.$cy.'" r="'.$r.'"/>';
	}
	function carreInscrit($cx,$cy,$r,$angle=0){
		$c=sqrt(2)*$r;
		$x=$cx - $c/2;
		$y=$cy - $c/2;
		return '<rect x="'.$x.'" y="'.$y.'" width="'.$c.'" height="'.$c.'" transform="rotate('.$angle.','.$cx.','.$cy.')"/>';
	}
	function triangleInscrit($cx,$cy,$r,$angle=0){
		$ax=$cx;
		$ay=$cy+$r;
		$bx=$cx-$r*sqrt(3)/2;
		$by=$cy-$r/2;
		$dx=$cx+$r*sqrt(3)/2;
		$dy=$cy -$r/2;
		return "<polygon points=\"$ax,$ay $bx,$by $dx,$dy\" transform=\"rotate($angle,$cx,$cy)\"/>";
	}
?>

