Feature: DenizBank web sitesi testi
  Scenario: SuperLimit Basvurusu
    Given Kullanici anasayfadadir
    Given Kendim icin ust menusunden basvurular linkine tiklar
    Given Super limit basvuru formu tiklar
    When TC Kimlik Numarasi yazilir
    When Cep telefonu yazilir
    When Dogum tarihi yazilir
    When KVKK kabul edilir
    Then Devam butonuna tiklanir