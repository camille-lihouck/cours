<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Seance 2</title>
        <meta charset="UTF-8" />
    </head>
    <body>
		<?php
			require ('fonction.php');
			$txt = proprieteToHTML(propriete("auteur(s) : Maini -Toto"));
			echo $txt;
			$img = couvertureToHTML(propriete("couverture : dune.jpg"));
			echo $img;
		?>
	</body>
</html>
