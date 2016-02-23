<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="fr" xml:lang="fr">
    <head>
        <meta charset="UTF-8" />
        <title>Test SVG 2</title>
		<style>
            * {
                font-family : sans-serif;
            }
            svg {
                width : 400px;
                height : 400px;
                border : solid 1pt black;
            }
            #dessin * {
                fill-opacity : 0.7;
            }
            svg rect {
                fill : lightblue;
                stroke : black;
            }
            svg circle {
                fill : red;
            }
            svg polygon {
                fill : black;
            }
            line.axe {
                stroke : grey;
                stroke-width : 1;
            }
            line.marque {
                stroke : grey;
                stroke-width : 1;
            }
            svg text {
                text-anchor : middle;
                font-size:7pt;
                
            }
        </style>
	</head>
	<body>

		<svg>		
			<?php
				require ('fonctionsSVG.php');
				$figures=$_GET['figure'];
				$cx=$_GET['cx'];
				$cy=$_GET['cy'];
				$r=$_GET['r'];
				foreach( $figures as $figure){
					if ($figure==cercle){
						echo cercle($cx,$cy,$r);
					}
					else if ($figure==rectangle){
						echo carreInscrit($cx,$cy,$r);	
					}
					else if ($figure==triangle){
						echo triangleInscrit($cx,$cy,$r);
					}
				}
			?>
		</svg>
	</body>
</html>
