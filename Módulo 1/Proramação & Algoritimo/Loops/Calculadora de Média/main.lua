local media = 0.0;
local soma_notas = 0.0;
local situacao = "";

for (local i = 0; i < 4; i = i + 1) do
    print("Insira nota " + i + ": ");
    local nota = io.read("*n");

    if (nota >= 0 && nota <= 10) do
        soma_notas += nota;
    else do
        print("Insira uma nota válida (1-10)...");
        i -= 1;
    end
end

media = soma_notas / 4;
if (media >= 7) do
    situacao = "Aprovado";
else do
    situacao = "Reporvado";
end

print("\nMédia final: " .. media .. "\nSituação: " .. situacao);