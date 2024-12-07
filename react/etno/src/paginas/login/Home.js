import React from 'react'

export function Home() {
    return (
        <div className='container-login'>
            <div className='login-form'>
                <h2>Login</h2>
                <form method='post'>
                    <input type='email' name='email' required placeholder='Email'></input>
                    <input type='password' name='senha' required placeholder='Senha'></input>
                    <div className='remind-forget'>
                        <label><input type='checkbox' name='remind'></input>Lembrar-me</label>
                        <a href='/changepassword'>Esqueceu sua senha?</a>
                    </div>
                    <button type='submit'>Login</button>
                </form>
            </div>
            <p>Novo usuário? <a href='/register'>Cadastre-se</a></p>
        </div>
    )
}
