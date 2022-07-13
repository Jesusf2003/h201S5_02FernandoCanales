import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormularyComponent } from './formulary/formulary.component';

const routes: Routes = [
  { path: '', redirectTo: 'formulary', pathMatch: 'full' },
  { path: 'formulary', component: FormularyComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
