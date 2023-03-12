function Selected(val)
         {
             if(val=='X'){
                 val='*';
                 document.getElementById("calculate").value+=val;
             }
             else{
                document.getElementById("calculate").value+=val;
             }
         }
           
         
         function solve()
         {
             let x = document.getElementById("calculate").value;
             let y = eval(x);
             document.getElementById("calculate").value = y;
         }
         
        
         function clr()
         {
             document.getElementById("calculate").value = "";
         }