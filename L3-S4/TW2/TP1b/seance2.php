<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Seance 2 PHP</title>
        <meta charset="UTF-8" />
	<link rel="stylesheet" href="iniPHP.css" />
    </head>
    <body><header>
            <h1>Deuxieme exercice PHP</h1>
            <h2>Réalisé par <span class="nom">Lihouck Camille</span></h2>
        </header>
        <section>
            <h2>Question 1</h2>
			<ul>
				<?php
					$listeNom = fopen("liste_noms.txt","r");
					$ligne = fgets($listeNom);
					while ($ligne){
						echo "<li>".$ligne."</li>";
						$ligne = fgets($listeNom);
					}
					fclose($listeNom);
				?>
			</ul>	
        </section>
		 <section>
            <h2>Question 2</h2>
			<table>
				<?php
					$terrain = fopen("terrain.txt",'r');
					$ligne = fgets($terrain);
					while ($ligne){
						echo "<tr>";
						for ($i=0;$i<strlen($ligne);$i++){
							$lettre = substr($ligne , $i , $i+1 );
							if ($lettre=="B")
								echo "<td class='blanc'><span>B</span></td>";
							else if ($lettre=="N")
								echo "<td class='noir'><span>N</span></td>";
							else
								echo "<td></td>";
						}
						echo "</tr>";
						$ligne = fgets($terrain);
					}
					fclose($terrain);
				?>
			</table>
        </section>
		
	</body>
</html>
