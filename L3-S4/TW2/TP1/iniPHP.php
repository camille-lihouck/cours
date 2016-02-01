<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Premier exercice PHP</title>
        <meta charset="UTF-8" />
        <link rel="stylesheet" href="iniPHP.css" />
    </head>
    <body>
        <header>
            <h1>Premier exercice PHP</h1>
            <h2>Réalisé par <span class="nom">Lihouck Camille</span></h2>
        </header>
        <section>
            <h2>Question 1</h2>
				<?php 
					date_default_timezone_set("Europe/Paris");
					echo 'Nous sommes le ' . date('d / m / Y') . ' il est ' . date('H:i:s') ;
				?>
        </section>
        <section>
            <h2>Question 2</h2>
 				<?php 
					echo 'La version de php utilisée est : '. PHP_VERSION; 
					echo '<br>';
					echo "L'OS utilisé est : " . PHP_OS;
				?>
        </section>
		<section>
            <h2>Question 3</h2>
 				<?php 
					$n=7;
					$texte='toto';
					$valeurs='$n vaut '. $n .' et $texte vaut ' .$texte;
					echo '<p>'. $valeurs .'</p>';

				?>
        </section>
		<section>
            <h2>Question 4</h2>
 				<?php 
					$n=7;
					$texte='toto';
					$valeurs='$n vaut '. $n .' et $texte vaut ' .$texte;
					for($i=0;$i<$n;$i++)
						echo '<p>'. $valeurs .'</p>';

				?>
        </section>
		<section>
			<h2>Question 5</h2>
				<?php
					$texte='toto';
					for ($i=0;$i<strlen($texte);$i++)
						echo '<p>'. substr($texte, 0,strlen($texte)-$i).'</p>';
				?>
		</section>
		<section>
			<h2>Question 6</h2>
				<ul>
					<?php
						$texte='toto';
						for ($i=0;$i<strlen($texte);$i++)
							echo '<li>'. substr($texte, 0,strlen($texte)-$i).'</li>';
					?>
				</ul>
		</section>
    </body>
    
</html>
