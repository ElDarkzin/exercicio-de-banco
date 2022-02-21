open class Cliente(
    var criarConta: String,
    var gerenciarConta: String,

    cpf: String,
    saldo: String,
    numeroAgencia: String,
    nome: String,
    documento: String,
    sacar: String


) : Conta(
    cpf = cpf,
    saldo = saldo,
    numeroAgencia = numeroAgencia,
    nome = nome,
    documento = documento,
    sacar = sacar,
) {
}