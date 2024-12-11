import React from 'react'

import ImgU from './../../media/pages/sobre/devs/piva.jpg'

export function Home() {
    return (
        <div className='container-user'>
            <div className='left-container container'>
                <div className='user-profile'>
                    <img src={ImgU} alt='Foto de usuário'></img>
                    <i class="bi bi-camera"></i>
                </div>
                <div className='user-text'>
                    <p>João Pedro Piva</p>
                    <i>Usuário</i>
                </div>
                <hr></hr>
                <i class="bi bi-box-arrow-right"></i>
            </div>
            <div className='right-container container'>
                <form method='post'>
                    <label>Nome</label>
                    <input type='text' name='nome' required placeholder='Nome' value='João Pedro Piva'></input>
                    <label>Email</label>
                    <input type='email' name='email' required placeholder='Email' value='piva@mail.com'></input>
                    <div className='form-buttons'>
                        <label>Senha</label>
                        <div className='changesenha'>
                            <input type='password' name='senha' required placeholder='Senha' value='senha1234'></input>
                            <button id='btnSenha'>Alterar senha</button>
                        </div>
                    </div>
                    <button id='btnSalvar'>Salvar mudanças</button>
                </form>
            </div>
        </div>
    )
}
