<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
        <script>
            let letStage = ${tower.stage};
            for (let i = 0; i <= letStage ;i++) {

                for (let j = 1; j <= i; j++) {

                    document.writeln("*")
                }
                document.writeln("<br>")
            }
            document.writeln("<br>")

         
        </script>

    </head>
    <body></body>
</html>