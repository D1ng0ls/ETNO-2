import React from "react";

import Img1 from './../../media/pages/sobre/docente/elisandra.png'
import Img2 from './../../media/pages/sobre/docente/joyce.png'
import Img3 from './../../media/pages/sobre/aluno/ana.png'
import Img4 from './../../media/pages/sobre/aluno/joao pedro.png'
import Img5 from './../../media/pages/sobre/aluno/kaua.png'
import Img6 from './../../media/pages/sobre/aluno/sabrina.png'
import Img7 from './../../media/pages/sobre/tecnico/ewiston.png'
import Img8 from './../../media/pages/sobre/tecnico/viviane.png'
import Img9 from './../../media/pages/sobre/externo/evandro.png'
import Img10 from './../../media/pages/sobre/externo/marcelo.png'
import Img11 from './../../media/pages/sobre/devs/eduardo.jpg'
import Img12 from './../../media/pages/sobre/devs/bonini.png'
import Img13 from './../../media/pages/sobre/devs/piva.jpg'
import Img14 from './../../media/pages/sobre/devs/duda.jpg'

export function Representantes() {
    return (
        <section class="container-representantes">
            <h2>Representantes</h2>
            <article class="area-representantes docentes">
                <h3>Docentes</h3>
                <div class="fotos-representantes">
                    <div class="repre-dev repre-dev1">
                        <img src={Img1} alt=""></img>
                        <p>Elisandra Pereira</p>
                    </div>
                    <div class="repre-dev repre-dev2">
                        <img src={Img2} alt=""></img>
                        <p>Joyce Helena Ferreira dos Ssntos</p>
                    </div>
                </div>
            </article>
            <article class="area-representantes discentes">
                <h3>Discentes</h3>
                <div class="fotos-representantes">
                    <div class="repre-dev repre-dev1">
                        <img src={Img3} alt=""></img>
                        <p>Ana Carolina Barbosa Marcelino</p>
                    </div>
                    <div class="repre-dev repre-dev2">
                        <img src={Img4} alt=""></img>
                        <p>João Pedro de Oliveira Geraldi</p>
                    </div>
                    <div class="repre-dev repre-dev3">
                        <img src={Img5} alt=""></img>
                        <p>Kauã Gimenez Rodrigues</p>
                    </div>
                    <div class="repre-dev repre-dev4">
                        <img src={Img6} alt=""></img>
                        <p>Sabrina Yasmim Ferreira Alves</p>
                    </div>
                </div>
            </article>
            <article class="area-representantes tec-adm">
                <h3>Tecnicos Administrativos</h3>
                <div class="fotos-representantes">
                    <div class="repre-dev repre-dev1">
                        <img src={Img7} alt=""></img>
                        <p>Ewiston Nascimento Mattos</p>
                    </div>
                    <div class="repre-dev repre-dev2">
                        <img src={Img8} alt=""></img>
                        <p>Viviane Renata Ventura Rissi </p>
                    </div>
                </div>
            </article>
            <article class="area-representantes comunidade">
                <h3>Comunidade Externa</h3>
                <div class="fotos-representantes">
                    <div class="repre-dev repre-dev1">
                        <img src={Img9} alt=""></img>
                        <p>Evandro Claudio Santos Barbeiro</p>
                    </div>
                    <div class="repre-dev repre-dev2">
                        <img src={Img10} alt=""></img>
                        <p>Marcelo Rufo Cuer</p>
                    </div>
                </div>
            </article>
            <article class="area-representantes eqp-devs">
                <h3>Equipe Desenvolvedora</h3>
                <div class="fotos-representantes">
                    <div class="repre-dev repre-dev1">
                        <img src={Img11} alt=""></img>
                        <p>Eduardo Santos</p>
                    </div>
                    <div class="repre-dev repre-dev2">
                        <img src={Img12} alt=""></img>
                        <p>Pedro Henrique Bonini</p>
                    </div>
                    <div class="repre-dev repre-dev3">
                        <img src={Img13} alt=""></img>
                        <p>João Pedro Piva</p>
                    </div>
                    <div class="repre-dev repre-dev4">
                        <img src={Img14} alt=""></img>
                        <p>Maria Eduarda Oliveira</p>
                    </div>
                </div>
            </article>
        </section>
    )
}