<div>
    <h1>Az applikációról</h1>
    <p>
        Egy autógyár új típust készít, nevezetesen a Bömbi márka MX22 típusa.<br>
        A program a megrendelései, készletei nyílvántartására szólgál.<br>
        Lehetőség van benne különböző felszereltségű autókat összerakni (NoExtra, FullExtra),<br>
        amihez az extráktól függően magától hozzárendeli az össz árat.<br>
        Be lehet állítani külön mind az autó, mint az extrák értékét.<br>
        Egyenlőre ez egy prototipus, <span style="text-decoration: underline;">GUI nem elérhető hozzá.</span>
    </p>
</div>

<div>
    <h1>Alapelvek</h1>
    <ul>
        <li>Single-Responsibility Principle</li>
        <li>Open-Closed Principle</li>
        <li>Dependency Inversion Principle</li>
    </ul>
</div>

<div>
    <h1>Tervezési minták</h1>
    <ul>
        <li>Strategy Pattern - agy Car objektumokból álló listát rendez id-szerint csökkenő vagy növekvő sorrendbe</li>
        <li>Decorator Pattern - az alap Car objektumot szereli fel különböző "kiegészítőkkel" (pl. Rim, Seat)</li>
        <li>Abstract Factory Pattern - az autókat gyártja le, két féle képpen: NoExtra és FullExtra </li>
    </ul>
</div>

<div>
    <h1>Unit teszt</h1>
    <p>Még nem döntöttem el hogy mely részét szeretném unit tesztelni</p>
</div>
