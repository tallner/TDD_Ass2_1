Funktion tar en lista av koordinater.  
Koordinater x, y, z.  
Funktionen returnerar koordinaternas form.  

Dessa tester ska utföras  
> - [x]  Tom lista returnerar ”None”
> - [x]  Lista med en koordinat returnerar ”Dot”
> - [x]  Lista med två koordinater returnerar ”Line”.
> - [x]  Lista med tre koordinater returnerar ”Triangle”.
> - [x]  Lista med fyra koordinater:
>> - [x] Lika långt mellan punkterna på axlarna returnerar ”Square”
>> - [x] Lika långt mellan parallella axlar returnerar ”Rectangle”
>> - [x] En offset mellan parallella axlars koordinater returnerar ”Parallelogram”
> - [x]  Om ingen ovan returnera ”2D Shape”
> - [x]  Lista med fem koordinater. 4 punkter skapar en square eller rectangle. 5e punkten finns på tredje koordinaten, returnera "Pyramid"
> - [x]  Lista med 8 koordinater. 
>> - [x] De skapar två squares som är bredden av en square iväg från varandra så är det en Cube
>> - [x] Om du hittar sex squares med åtta koordinater så är det en cube, mer eller mindre.
>> - [x] Kolla även om den är en Rectangular Prism, vilket bara är en 3D rektangel.
>> - [x] Annars kanske den är en ”3D Shape”, om den har djup i 3 dimensioner men ingen form som
känns igen.
